package com.ttnd.test

/**
 * Created by niranjan on 5/1/16.
 */
class FileOperations {
    static main(){
       def s =  new File("/home/niranjan/foo.txt").readLines()
        println(s)
    }
}
