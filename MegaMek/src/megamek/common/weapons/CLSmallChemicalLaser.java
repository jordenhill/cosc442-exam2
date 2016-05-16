/**
 * MegaMek - Copyright (C) 2004,2005 Ben Mazur (bmazur@sev.org)
 * 
 *  This program is free software; you can redistribute it and/or modify it 
 *  under the terms of the GNU General Public License as published by the Free 
 *  Software Foundation; either version 2 of the License, or (at your option) 
 *  any later version.
 * 
 *  This program is distributed in the hope that it will be useful, but 
 *  WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY 
 *  or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License 
 *  for more details.
 */
/*
 * Created on May 29, 2004
 *
 */
package megamek.common.weapons;

import megamek.common.AmmoType;
import megamek.common.IGame;
import megamek.common.TechConstants;
import megamek.common.ToHitData;
import megamek.common.actions.WeaponAttackAction;
import megamek.server.Server;

// TODO: Auto-generated Javadoc
/**
 * The Class CLSmallChemicalLaser.
 *
 * @author Jason Tighe
 */
public class CLSmallChemicalLaser extends AmmoWeapon {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 322396740172378519L;

    /**
     * Instantiates a new CL small chemical laser.
     */
    public CLSmallChemicalLaser() {
        this.techLevel = TechConstants.T_CLAN_EXPERIMENTAL;
        this.name = "Small Chem Laser";
        this.setInternalName("CLSmallChemicalLaser");
        this.setInternalName("CLSmallChemLaser");
        this.heat = 1;
        this.damage = DAMAGE_VARIABLE;
        this.rackSize = 3;
        this.ammoType = AmmoType.T_CHEMICAL_LASER;
        this.minimumRange = WEAPON_NA;
        this.shortRange = 1;
        this.mediumRange = 2;
        this.longRange = 3;
        this.extremeRange = 4;
        this.waterShortRange = 1;
        this.waterMediumRange = 2;
        this.waterLongRange = 3;
        this.waterExtremeRange = 3;
        this.tonnage = 0.5f;
        this.criticals = 1;
        this.flags |= F_ENERGY | F_DIRECT_FIRE;
        this.bv = 7;
        this.cost = 100000;
        this.shortAV = 3;
        this.maxRange = RANGE_SHORT;
        this.atClass = CLASS_LASER;
    }

    /*
     * (non-Javadoc)
     * 
     * @see megamek.common.weapons.Weapon#getCorrectHandler(megamek.common.ToHitData,
     *      megamek.common.actions.WeaponAttackAction, megamek.common.Game,
     *      megamek.server.Server)
     */
    protected AttackHandler getCorrectHandler(ToHitData toHit,
            WeaponAttackAction waa, IGame game, Server server) {
        return new ChemicalLaserHandler(toHit, waa, game, server);
    }
}
