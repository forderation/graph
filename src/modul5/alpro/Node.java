/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul5.alpro;

import java.util.ArrayList;

public class Node {
    private char name;
    private ArrayList<Node> connect;
    private ArrayList<Integer> weight;
    public Node(char name){
        this.name = name;
        connect  = new ArrayList();
    }
    public char getChar(){
        return name;
    }
    
    public ArrayList getListConnect(){
        return connect;
    }
    
    public ArrayList getListWeight(){
        return weight;
    }
    
    public boolean isEmptyConnect(){
        return connect.isEmpty() ? true:false;
    }
    
    public Node getNodeConnect(char name){
        for(int i =0;i<connect.size();i++){
            if(connect.get(i).name==name){
                return connect.get(i);
            }
        }
        return null;
    }
    public Integer getWeight(char name){
        for(int i =0;i<weight.size();i++){
            if(connect.get(i).name==name){
                return weight.get(i);
            }
        }
        return null;
    }
    public void setConnect(Node dest, Integer weight){
        connect.add(dest);
        this.weight.add(weight);
    }
}
