package com.ttnd.test

/**
 * Created by niranjan on 5/1/16.
 */
class ListTest {
    static main(){
        List<Integer> list = [1,1,1,1,1,1,"a",[1,2,"3"]]
        println("Original List :: "<<list)
        println("Unique List :: "+list.unique())
    }
}
