object q3 {
  def toUpper(inputText:String):String=inputText.toUpperCase()
  def toLower(inputText:String):String=inputText.toLowerCase()

  def formatNames(name:String)(changingIndex:Int* )(Func: String=> String): String={

    if (!(changingIndex.isEmpty)){

      var tempText="";
      var x=0;

      while(x<name.length()){
        if(changingIndex.contains(x)){
          tempText=tempText+ Func(name.charAt(x).toString)
        }
        else{
          tempText=tempText+name.charAt(x).toString
        }
        x=x+1
      }
      return  tempText;
    }

    else{
      return Func(name)
    }

  }


  def main(args: Array[String]):Unit={
    println(formatNames("Benny")()(toUpper));
    println(formatNames("Niroshan")(1)(toUpper));
    println(formatNames("Saman")()(toLower));
    println(formatNames("Kumara")(5)(toUpper));
  }

}
