import java.io.File
import scala.collection.JavaConversions

///println("---INFO: running")

def raus(f: String)={
	val bla= 
	    <a href="#" class="thumbnail">
	      <img src={f} alt="obrazek"/>
	    </a>
       	
	println(bla)
}

val dir = new File(".")
val filez = dir.list.filter( _.toLowerCase.endsWith(".jpg") )
filez foreach raus
//G123!@#a
