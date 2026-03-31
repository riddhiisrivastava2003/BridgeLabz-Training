import java.time.LocalDate;
import java.util.*;
public class PolicyManager {

	private Map<String, Policy> policyMap = new HashMap<>();

	private Map<String, Policy> insertionOrderMap = new LinkedHashMap<>();

	private TreeMap<LocalDate , List<Policy>> expiryDateMap = new TreeMap<>();

        public void addPolicy(Policy policy) {
		policyMap.put(policy.getPolicyNumber(), policy);
		insertionOrderMap.put(policy.getPolicyNumber(), policy);
		
		expiryDateMap.computeIfAbsent(policy.getExpiryDate(),k-> new ArrayList<>()).add(policy);	
	}
	

	public Policy getPolicyByNumber(String policyNumber) {
		return policyMap.get(policyNumber);
		
	}
    public List<Policy> getPoliciesExpiringSoon() {
        List<Policy> result = new ArrayList<>();
        LocalDate today = LocalDate.now();
        LocalDate next30Days = today.plusDays(30);

        for (Map.Entry<LocalDate, List<Policy>> entry :
                expiryDateMap.subMap(today, true, next30Days, true).entrySet()) {
            result.addAll(entry.getValue());
        }
        return result;
    }
    public List<Policy> getPoliciesByHolder(String holderName){
    	List<Policy> result = new ArrayList<>();
    	
    	for(Policy policy : policyMap.values()) {
    		if(policy.getPolicyHolderName().equalsIgnoreCase(holderName)){
    			result.add(policy);
    			
    		}
    	}
    	return result;
    	
    }

    public void removeExpiredPolicies() {
        LocalDate today = LocalDate.now();

        Iterator<Map.Entry<String, Policy>> iterator = policyMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Policy policy = iterator.next().getValue();
            if (policy.getExpiryDate().isBefore(today)) {
                iterator.remove();
                insertionOrderMap.remove(policy.getPolicyNumber());
            }
        }

        expiryDateMap.headMap(today).clear();
    }

    public void displayAllPolicies() {
    	for(Policy policy : insertionOrderMap.values()) {
    		System.out.println(policy);
    	}
    }

}