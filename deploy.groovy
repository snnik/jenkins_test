node{
    stage "Greatings!"
    println "Hello World"
    home = tool name: "mc-latest", type: "mc"
    println home
}