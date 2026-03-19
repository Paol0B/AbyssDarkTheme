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
        id = "${providers.gradleProperty("pluginGroup").get()}.abyss-dark"
        name = "Abyss Dark"
        version = providers.gradleProperty("pluginVersion")

        ideaVersion {
            sinceBuild = providers.gradleProperty("pluginSinceBuild")
            untilBuild = providers.gradleProperty("pluginUntilBuild")
        }

        vendor {
            name = "Paolo Bertinetti"
            url = "https://github.com/paol0b/FleetDarkTheme"
        }

        description = """
            <p>Bring the sleek, minimal aesthetic of <b>JetBrains Fleet</b> to IntelliJ IDEA and all JetBrains IDEs.</p>

            <h3>Features</h3>
            <ul>
              <li><b>Fleet-accurate UI</b> — Dark islands (#18191B) floating on a near-black canvas (#090909), matching Fleet's signature look pixel-for-pixel.</li>
              <li><b>Full editor color scheme</b> — Purple keywords, green strings, teal types, blue functions, and orange numbers — faithful to Fleet's syntax palette.</li>
              <li><b>Complete coverage</b> — Every UI surface is themed: popups, tool windows, tabs, notifications, VCS, debugger, breadcrumbs, and more.</li>
              <li><b>Semantic color system</b> — Built on a layered token architecture for consistent contrast across all components.</li>
            </ul>

            <h3>Color Palette</h3>
            <ul>
              <li>Islands / Editor: <code>#18191B</code></li>
              <li>Canvas / Background: <code>#090909</code></li>
              <li>Popups / Menus: <code>#18181A</code></li>
              <li>Keywords: purple · Strings: green · Types: teal · Functions: blue</li>
            </ul>

            <p>Designed for developers who love Fleet's clean look but prefer the power of IntelliJ IDEA.</p>
        """.trimIndent()
    }

    pluginVerification {
        ides {
            recommended()
        }
    }
}
