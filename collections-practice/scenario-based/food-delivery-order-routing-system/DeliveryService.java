import java.util.*;
public class DeliveryService{

    Queue<Order> orderQueue=new LinkedList<>();
    List<Agent> agents=new ArrayList<>();
    Map<Integer, Integer> activeDeliveries=new HashMap<>();


    public void placeOrder(Order order){
        orderQueue.add(order);
        System.out.println("Oder placed: "+order);
    }

    public void addAgent(Agent agent){
        agents.add(agent);
        System.out.println("Agent added: "+agent.agentId);
    }

    public void assignOrder() throws NoAgentAvailableException{
        if(orderQueue.isEmpty()){
            System.out.println("No orders in queue.");
            return;
        }

        Order order=orderQueue.peek();

        for(Agent agent:agents){
            if(agent.availability){
                agent.availability=false;
                orderQueue.poll();
                activeDeliveries.put(order.orderId, agent.agentId);
                

                System.out.println("Order "+order.orderId+" assigned to agent "+agent.agentId);
                return;
            }

            
        }
        throw new NoAgentAvailableException("No delivery agent available. ");

    }

    public void cancelOrder(int orderId){
        Integer agentId=activeDeliveries.remove(orderId);

        if(agentId!=null){
            for(Agent agent:agents){
                if(agent.agentId==agentId){
                    agent.availability=true;
                    break;
                }
            }

            System.out.println("Order "+orderId+" cancelled.");
        }
        else{
            System.out.println("Order not found.");
        }
    }

    public void viewActiveDeliveries(){
        if(activeDeliveries.isEmpty()){
            System.out.println("No active deliveries.");
        }
        else{
            System.out.println("Active Deliveries: ");
            activeDeliveries.forEach(
                (orderId,agentId)->
                System.out.println("Order: "+orderId+" -> Agent: "+agentId)
            );
        }
    }

}