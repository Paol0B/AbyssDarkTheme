plugins {
    id("org.jetbrains.intellij.platform") version "2.6.0"
}

group = providers.gradleProperty("pluginGroup").get()
version = providers.gradleProperty("pluginVersion").get()

repositories {
    mavenCentral()
    intellijPlatform {
        defaultRepositories()
    }
}

dependencies {
    intellijPlatform {
        create(
            providers.gradleProperty("platformType"),
            providers.gradleProperty("platformVersion")
        )
        pluginVerifier()
    }
}

intellijPlatform {
    pluginConfiguration {
        id = "${providers.gradleProperty("pluginGroup").get()}.fleet-dark-theme"
        name = providers.gradleProperty("pluginName")
        version = providers.gradleProperty("pluginVersion")

        ideaVersion {
            sinceBuild = providers.gradleProperty("pluginSinceBuild")
            untilBuild = providers.gradleProperty("pluginUntilBuild")
        }

        vendor {
            name = "paol0b"
        }

        description = """
            A pure black UI theme for IntelliJ IDEA inspired by the JetBrains Fleet aesthetic.
            Based on Islands Dark, this theme replaces the UI appearance with Fleet's clean,
            minimal pure-black style while keeping the default editor color scheme untouched.
        """.trimIndent()
    }

    pluginVerification {
        ides {
            recommended()
        }
    }
}
