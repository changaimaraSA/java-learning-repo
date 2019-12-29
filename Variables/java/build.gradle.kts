plugins {
    `java`
}

sourceSets {                                
    main {                                  
        java.srcDir("src")
    }
}

task ("run", JavaExec::class) {
    main = "VariableExample"
    classpath = sourceSets["main"].runtimeClasspath
}