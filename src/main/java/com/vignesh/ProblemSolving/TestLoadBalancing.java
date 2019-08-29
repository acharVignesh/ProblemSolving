package com.vignesh.ProblemSolving;

import java.util.*;
import java.util.stream.Collectors;

public class TestLoadBalancing {
    public static HashMap<String,Double> serverConfig = new HashMap<String, Double>();
    public static int REQUEST_DISTRIBUTION_CONSTANT=30;
    public static  int counter=0;

    static {
        serverConfig.put("Server1", 0.3);
        serverConfig.put("Server2", 0.7);
        serverConfig.put("Server3", 0.8);
        serverConfig.put("Server4", 0.9);
    }

    public static void main(String[] args) {
        for(int i=0;i<10;i++){

        }
    }

    public static void assignRequest(String request){
        Map<String, Double> sortMapByValue = sortMapByValue(serverConfig);


    }
    public static void assignServerToRequest(String request){
        int i = 0;
        int j = 0;
        while (i < serverConfig.size()) {

            List<String> keyList = (List<String>) serverConfig.keySet().stream().collect(Collectors.toList());
            System.out.println(keyList.get(i) + " : " + serverConfig.get(keyList.get(i)));


            i++;
            j++;
            if (i == serverConfig.size()) {
                i = 0;
            }
            if (j == 1000) {
                break;
            }
        }
    }
    public static String getServerbyProbalityRank(int rank){
        Map<String, Double> serverVsProb = sortMapByValue(serverConfig);
        int i=0;
        String serverName="";
        for(String server:serverVsProb.keySet()){
            if(rank==i){
                serverName=server;
                break;
            }
            i++;
        }
        return serverName;
    }
    public static Map<String,Double> sortMapByValue(HashMap<String,Double> hm){
        Set<Map.Entry<String, Double>> entries = hm.entrySet();
        List<Map.Entry<String, Double>> entryList=new LinkedList<>(entries);
        Collections.sort(entryList,(o1,o2)->o1.getValue().compareTo(o2.getValue()));
        HashMap<String,Double> hashMap=new HashMap<String, Double>();
        for(Map.Entry<String,Double> entry:entryList){
            hashMap.put(entry.getKey(),entry.getValue());
        }
        return hashMap;
    }
}
