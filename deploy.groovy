node{
    stage "Greatings!"
        println "Hello World"
    stage "mc deploy"
        ansiblePlaybook colorized: true, installation: 'main', playbook: 'tst.yml'
    stage "mc home path"
        home = tool name: "mc", type: "mc"
        println home
}