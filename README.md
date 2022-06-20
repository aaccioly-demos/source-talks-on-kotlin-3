<!--
SPDX-FileCopyrightText: 2022 Anthony Accioly

SPDX-License-Identifier: CC-BY-SA-4.0
-->

# Source Talks : On Kotlin #3
Slides and demo code for the Source Talks Community Event @ 2022-06-16

## Build

The [demo][demo-code] requires JDK 17 or newer. It was built and tested with [Eclipse Temurin™][eclipse-temurin].
It bundles [Gradle Wrapper][gradle-wrapper] to simplify the build process.

```sh
cd demo
./gradlew build
```

## License

Copyright 2022 [Anthony Accioly][blog]

- All original [demo][demo-code] code is licensed under [Apache-2.0][apache-2.0].
- [Slides][slides] and [README][readme] are licensed under [CC BY-SA 4.0][cc-by-sa].
 
  [![CC BY-SA 4.0][cc-by-sa-image]][cc-by-sa]

### Third-party licenses

- [Gradle Wrapper][gradle-wrapper], Copyright © 2007-2019 Gradle, Inc. and original authors is 
[licensed][gradle-license] under [Apache-2.0][apache-2.0].

[apache-2.0]: https://spdx.org/licenses/Apache-2.0.html
[blog]: https://accioly.dev
[cc-by-sa]: https://spdx.org/licenses/CC-BY-SA-4.0.html
[cc-by-sa-image]: https://i.creativecommons.org/l/by-sa/4.0/88x31.png
[demo-code]: demo
[eclipse-temurin]: https://adoptium.net/temurin/releases/?version=17
[gradle-license]: https://docs.gradle.org/current/userguide/licenses.html
[gradle-wrapper]: https://docs.gradle.org/current/userguide/gradle_wrapper.html
[readme]: README.md
[slides]: slides
