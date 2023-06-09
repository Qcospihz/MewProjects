plugins {
    alias(libs.plugins.indra)
}

dependencies {
    // server api
    api(libs.server.paper)

    // libs that present as other plugins
    api(project(":mewcore"))
    api(libs.helper)
    api(libs.betonquest) {
        exclude("io.papermc")
        exclude("com.comphenix.packetwrapper")
        exclude("me.filoghost.holographicdisplays")
    }
}

indra {
    javaVersions().target(17)
}