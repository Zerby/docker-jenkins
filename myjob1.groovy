job('My Job 1') {
    scm {
        git('https://github.com/Zerby/docker-jenkins') {  node -> 
            node / gitConfigName('zerby')
            node / gitConfigEmail('clement.zerb@eemi.com')
        }
    }
    triggers {
        scm('H/5 * * * *')
    }
    wrappers {
        nodejs('NodeJS10')
    }
    steps {
        shell("npm install")
        shell("npm test")
    }
}
