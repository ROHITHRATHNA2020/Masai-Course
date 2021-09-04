fun main(){
    val a = intArrayOf(-2,-1,-2,1,2,33)
    for(i in a.indices){
        var count = 0
        for(j in a.indices){
            if(a[i] == a[j])
                count++
        }
        if(count>1)
            print("${a[i]} ")
    }
}