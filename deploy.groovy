node{
    stage "Greatings!"
        println "Hello World"
    stage "mc deploy"
        ansiblePlaybook tst.yml
    stage "mc home path"
        home = tool name: "mc", type: "mc"
        println home
}