package com.sardina;

interface ShootsGun {

    public String shootSidearm();
    public String shootRifle();

    default String laserGun() {
        return "ZzzzzZappp Zzzappp....";
    }
}
