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
 * Created on Sep 24, 2004
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
 * The Class CLHeavyRecoillessRifle.
 *
 * @author Andrew Hunter
 */
public class CLHeavyRecoillessRifle extends Weapon {
    
    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -4900393422594499114L;

    /**
     * Instantiates a new CL heavy recoilless rifle.
     */
    public CLHeavyRecoillessRifle() {
        super();
        this.techLevel = TechConstants.T_CLAN_TW;
        this.name = "Heavy Recoilless Rifle";
        this.setInternalName(this.name);
        this.addLookupName("CLHeavy Recoilless Rifle");
        this.damage = 3;
        this.ammoType = AmmoType.T_NA;
        this.shortRange = 3;
        this.mediumRange = 5;
        this.longRange = 7;
        this.extremeRange = 10;
        this.bv = 22;
        this.flags |= F_DIRECT_FIRE | F_NO_FIRES | F_BALLISTIC;
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
        return new HeavyRecoillessHandler(toHit, waa, game, server);
    }
}