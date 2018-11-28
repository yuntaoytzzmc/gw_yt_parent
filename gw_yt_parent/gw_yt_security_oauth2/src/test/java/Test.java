import ch.qos.logback.core.net.SyslogOutputStream;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {

    public static void main(String[] args) {
        String  ter ="aaadbbbsdbdsbdbdsdfbbsdfbdbfbdfbsdbfbdbfjsdjfsdfsfjfsdkjafywewu";
        String []sts =ter.split("");
        Map map  = new HashMap();
        for(int  i =0;i<sts.length;i++){
            if(!"".equals(sts[i])&& map.containsKey(sts[i])){
                 map.put(sts[i],(Integer.parseInt(map.get(sts[i]).toString())+1));
            }else if(!"".equals(sts[i])){
                map.put(sts[i],1);
            }
        }
        System.out.println(map);
        Set<String> sets = map.keySet();
        for (String  ststs :sets){
            System.out.println(ststs+""+map.get(ststs));
        }
    }
}
