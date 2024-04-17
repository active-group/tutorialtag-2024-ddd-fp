# OOP and FP Can't Be Friends, Yet

## Java-Code

```sh
cd java-code
mvn compile
```

Test should fail:

```sh
mvn test
```

## Haskell-Code Via Docker (Windows, macOS, Linux, ...)

- [Docker](https://www.docker.com/) installieren
- für macOS und Windows: der Docker-VM ggf. mindestens 6GB Speicher
  geben
- [Visual Studio Code](https://code.visualstudio.com/download) installieren
- die Extension "Dev Containers"
  (`ms-vscode-remote.remote-containers`) installieren: Auf das
  Extensions-Icon links klicken, nach "Containers" suchen, "Dev
  Containers" anwählen, auf "Install" klicken
- auf das Datei-Icon links oben klicken
- oben im Menü "View" -> "Command Palette", dort
  "containers" tippen, "Remote - Containers: Open Folder in Container"
  selektieren
- das Top-Level-Verzeichnis (Ort des geklonten Repos) selektieren

Da sollte jetzt eine Meldung erscheinen, dass ein Docker-Image gebaut
wird.  Das kann eine Weile dauern, sollte aber ohne Fehlermeldung
vonstatten gehen.

- wenn das `direnv`-Plugin nachfragt, auf `Allow` klicken, und
  evtl. danach den Reload akzeptieren
- In der Datei `haskell-code/Intro.hs` das `module` verunstalten (z. B. einen
  Buchstaben entfernen)

Nach etwas Ladezeit (die erforderlichen Haskell-Pakete müssen
heruntergeladen werden) sollten in der Datei Anmerkungen des Linters
erscheinen.
