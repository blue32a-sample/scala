import scala.io.Source
import java.io.{FileNotFoundException, IOException}

object Main extends App {
    def openAndReadAFile = {
        Source.fromFile("not-found.txt")
    }
    try {
        openAndReadAFile
    } catch {
        case e: FileNotFoundException => println("Couldn't find that file.")
        case e: IOException => println("Had an IOException trying to read that file")
    } finally {
        println("finally")
    }
}
