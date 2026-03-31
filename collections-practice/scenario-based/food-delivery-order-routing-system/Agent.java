public class Agent{

    int agentId;
    boolean availability=true;

    public Agent( int agentId){
        this.agentId=agentId;
    }

    @Override
    public String toString(){
        return "Agent Id -> "+agentId+" | is Available? -> "+availability;
    }
} 