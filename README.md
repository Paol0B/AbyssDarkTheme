# Fleet Dark Theme

> Bring the sleek, minimal aesthetic of [JetBrains Fleet](https://www.jetbrains.com/fleet/) to IntelliJ IDEA and all JetBrains IDEs.

![Fleet Dark Theme](https://img.shields.io/badge/theme-Fleet%20Dark-18191B?style=for-the-badge&labelColor=090909)
![JetBrains Plugin](https://img.shields.io/badge/JetBrains-Plugin-3871E1?style=for-the-badge&logo=jetbrains&logoColor=white)

---

## Screenshots

<!-- Add screenshots here -->
<!-- ![Editor](screenshots/editor.png) -->
<!-- ![Tool Windows](screenshots/toolwindows.png) -->

## Features

- **Fleet-accurate UI** — Dark islands (`#18191B`) floating on a near-black canvas (`#090909`), matching Fleet's signature look pixel-for-pixel
- **Full editor color scheme** — Purple keywords, green strings, teal types, blue functions, and orange numbers — faithful to Fleet's syntax palette
- **Complete coverage** — Every UI surface is themed: popups, tool windows, tabs, notifications, VCS, debugger, breadcrumbs, and more
- **Semantic color system** — Built on a layered token architecture for consistent contrast across all components

## Color Palette

| Surface | Color | Hex |
|---------|-------|-----|
| Canvas (background) | ![#090909](https://via.placeholder.com/12/090909/090909.png) | `#090909` |
| Islands (editor, tool windows) | ![#18191B](https://via.placeholder.com/12/18191B/18191B.png) | `#18191B` |
| Popups & menus | ![#18181A](https://via.placeholder.com/12/18181A/18181A.png) | `#18181A` |
| Borders | ![#26272A](https://via.placeholder.com/12/26272A/26272A.png) | `#26272A` |

### Syntax Highlighting

| Token | Color | Hex |
|-------|-------|-----|
| Keywords | ![#CC75F4](https://via.placeholder.com/12/CC75F4/CC75F4.png) | `#CC75F4` |
| Strings | ![#6AAB73](https://via.placeholder.com/12/6AAB73/6AAB73.png) | `#6AAB73` |
| Types / Classes | ![#6AAEA6](https://via.placeholder.com/12/6AAEA6/6AAEA6.png) | `#6AAEA6` |
| Functions | ![#56A8F5](https://via.placeholder.com/12/56A8F5/56A8F5.png) | `#56A8F5` |
| Numbers | ![#CF8E6D](https://via.placeholder.com/12/CF8E6D/CF8E6D.png) | `#CF8E6D` |
| Comments | ![#6B6C70](https://via.placeholder.com/12/6B6C70/6B6C70.png) | `#6B6C70` |
| Constants | ![#C77DBB](https://via.placeholder.com/12/C77DBB/C77DBB.png) | `#C77DBB` |
| Annotations | ![#BBB529](https://via.placeholder.com/12/BBB529/BBB529.png) | `#BBB529` |

## Installation

### From JetBrains Marketplace

1. Open **Settings** → **Plugins** → **Marketplace**
2. Search for **Fleet Dark Theme**
3. Click **Install** and restart the IDE
4. Go to **Settings** → **Appearance & Behavior** → **Appearance** → Select **Fleet Dark**

### Manual Installation

1. Download the latest release from [Releases](https://github.com/paol0b/FleetDarkTheme/releases)
2. Open **Settings** → **Plugins** → **⚙️** → **Install Plugin from Disk...**
3. Select the downloaded `.zip` file
4. Restart the IDE

### Build from Source

```bash
git clone https://github.com/paol0b/FleetDarkTheme.git
cd FleetDarkTheme
./gradlew buildPlugin
```

The plugin zip will be in `build/distributions/`.

## Compatibility

- IntelliJ IDEA 2024.3+
- All JetBrains IDEs (WebStorm, PyCharm, CLion, Rider, GoLand, etc.)
- Build range: `243` – `261.*`

## Architecture

The theme uses a layered token system:

```
Canvas (#090909)           ← Main window background
  └─ Layer 0 (#18191B)    ← Islands: editor, tool windows
      └─ Layer 1 (#18181A) ← Popups, menus, dropdowns
          └─ Layer 2 (#26272A) ← Tooltips, floating toolbars
```

All UI components reference semantic tokens rather than hardcoded hex values, ensuring consistency across the entire IDE.

## Known Issues

- **Performance Monitor background** — The monitoring tool window may show a slightly different background due to a [known JetBrains bug](https://youtrack.jetbrains.com/issue/RIDER-128702). The charts themselves are themed correctly.

## Contributing

Contributions are welcome! If you notice any UI component that doesn't match Fleet's look:

1. Fork this repository
2. Create a branch (`git checkout -b fix/component-name`)
3. Make your changes
4. Submit a Pull Request

### Useful Resources

- [IntelliJ Theme Colors Reference](https://plugins.jetbrains.com/docs/intellij/platform-theme-colors.html)
- [Theme Metadata JSON](https://github.com/JetBrains/intellij-community/blob/master/platform/platform-resources/src/themes/metadata/IntelliJPlatform.themeMetadata.json)
- [Official expUI Dark Theme](https://github.com/JetBrains/intellij-community/blob/master/platform/platform-resources/src/themes/expUI/expUI_dark.theme.json)
---

<p align="center">
  <i>Designed for developers who love Fleet's clean look but prefer the power of IntelliJ IDEA.</i>
</p>
