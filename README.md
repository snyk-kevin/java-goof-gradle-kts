## Java Goof (Gradle KTS version)

This is a collection of Java demo apps that are vulnerable in different ways.

It's divided into modules, each one having its own README:

* [Todolist Goof](todolist-goof/README.md)
* [Log4Shell Goof](log4shell-goof/README.md)
* [Quickstart for running both Todolist with Log4Shell in Kubernetes](README-K8S.md)

To run the Snyk Security check, run:

```
snyk test --org=XXX --all-projects
```

Replace XXX with your organization.