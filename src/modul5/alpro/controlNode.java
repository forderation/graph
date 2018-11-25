/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul5.alpro;

import java.util.ArrayList;
import java.util.Collections;

public class controlNode {
    Node src;
    public controlNode(Node node){
        src = node;
    }
    public ArrayList getPath(Node dest){
        ArrayList task = new ArrayList();
        ArrayList result = new ArrayList();
        if(src.isEmptyConnect()){
            return null;
        }
        Collections.sort(src.getListWeight());
        while(current != )
        
        return task;
    }
}
