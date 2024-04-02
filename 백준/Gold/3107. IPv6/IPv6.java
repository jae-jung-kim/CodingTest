import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String ipv6 = br.readLine();
        if(ipv6.contains("::")){
            ipv6 = ipv6.replace("::",":group:");
        }
        List<String> ipv6s = Stream.of(ipv6.split(":")).collect(Collectors.toList());
        List<String> fullps = new ArrayList<>();
        for(int i=0; i<ipv6s.size(); i++){
            String s = ipv6s.get(i);
            if(s.isEmpty()) continue;
            while(s.length() <4){
                s = "0" + s;
            }
            fullps.add(s);
        }
        int groupLen = 8-fullps.size()+1;
        String[] ipFullAddresses = new String[8];
        int idx = 0;
        for(String ip : fullps){
            if(ip.equals("group")){
                while(groupLen-- >0){
                    ipFullAddresses[idx++] = "0000";
                }
            }else{
                ipFullAddresses[idx++]=ip;
            }
        }
        System.out.println(String.join(":",ipFullAddresses));
    }
}