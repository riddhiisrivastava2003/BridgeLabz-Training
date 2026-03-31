import java.util.*;

class Version{
    String version;
    int size;



    Version(String version, int size){

        this.version = version;
        this.size = size;
    }
}

public class VersionControl{


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        Map<String,List<Version>> files = new HashMap<>();
        Map<String,Version> latest= new HashMap<>();

        for (int i=0;i<n;i++){

            String[] parts = sc.nextLine().split(" ");
            String command = parts[0];



            if(command.equals("UPLOAD")){

                String name = parts[1];
                String ver = parts[2];

                int size=Integer.parseInt(parts[3]);

                files.putIfAbsent(name,new ArrayList<>());

                boolean exists =false;

                for (Version v:files.get(name)) {

                    if (v.version.equals(ver)) {
                        exists = true;

                        break;
                    }
                }

                if (!exists){


                    Version v = new Version(ver, size);
                    files.get(name).add(v);
                    latest.put(name, v);

                }

            }
            else if(command.equals("FETCH")){


                String name =parts[1];

                if(!files.containsKey(name)){

                    System.out.println("File Not Found");

                    continue;
                }

                List<Version> list=new ArrayList<>(files.get(name));

                Collections.sort(list,(a, b) -> {

                    if (a.size != b.size)

                        return a.size - b.size;

                    return a.version.compareTo(b.version);
                });

                for(Version v:list){

                    System.out.println(name + " " + v.version + " " + v.size);
                }

            }
            else if(command.equals("LATEST")){


                String name=parts[1];

                if(!latest.containsKey(name)){

                    System.out.println("File Not Found");
                    continue;

                }

                Version v=latest.get(name);

                System.out.println(name + " "+v.version+" "+v.size);

            } else if (command.equals("TOTAL_STORAGE")){

                String name = parts[1];


                if (!files.containsKey(name)){
                    System.out.println("File Not Found");

                    continue;
                }

                int sum=0;
                for (Version v:files.get(name)) {
                    sum += v.size;
                }

                System.out.println(name + " " + sum);
            }

        }

    }
}