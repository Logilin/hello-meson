LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8c16666ae6c159876a0ba63099614381"

SRC_URI = "git://github.com/logilin/hello-meson;protocol=https;branch=master"

PV = "1.0+git"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

inherit meson
