package hello

import java.io.File
import org.apache.catalina.WebResourceRoot
import org.apache.catalina.startup.Tomcat
import org.apache.catalina.webresources.DirResourceSet
import org.apache.catalina.webresources.StandardRoot

val docBase = File("src/main/webapp").absolutePath
val programBase = File("target/classes").absolutePath

fun main(args: Array<String>) {
    val tomcat = Tomcat()

    val ctx = tomcat.addWebapp("", docBase)
    ctx.resources = StandardRoot(ctx)
    ctx.resources.addPreResources(DirResourceSet(ctx.resources, "/WEB-INF/classes", programBase, "/"))

    tomcat.setPort(8080)
    tomcat.start()
    tomcat.server.await()
}