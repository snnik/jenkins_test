node{
    stage "Greatings!"
    println "Hello World"
    home = tool name: "mc", type: "mc"
    println home
}