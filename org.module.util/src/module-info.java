module org.module.util {
    requires transitive org.module.global;

    exports org.pkg.util to org.module.base, org.module.concrete;
}