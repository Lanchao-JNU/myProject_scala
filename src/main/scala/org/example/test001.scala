package org.example


class Person(val name:String,var age:Int)
object test001 {

  def meth1():String ={"hi"}

  def meth2():String = {
    val d = new java.util.Date()
    d.toString
  }

  def main(args: Array[String]): Unit = {
    var array: Array[String] = new Array(5)
    array = new Array(2)
    array(0)="hello"
    println(array(0))

    val p = new Person("Eric",20)
    println(p.name)
    println(p.age)
    p.age=18
    println(p.age)

    def eualsign(s:String) =
      println("equalSign:"+s)

    def eualsign2(s:String): Unit ={
      println("equalSign2:"+s)
    }

    def commas(s1:String,
               s2:String)=
      Console.println("comma:"+s1+
      ","+s2)


    eualsign("hey")

    eualsign2("hey")

    commas("a","b")

    println(meth1())
    println(meth2())


  }
}
