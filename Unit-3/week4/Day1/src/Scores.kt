fun main(){
    val scores = arrayOf(10,12,1,2,15)
    var low = scores[0]
    for(i in scores){
        if(i<low)
            low = i
    }
    print("Lowest Scores is $low")
}