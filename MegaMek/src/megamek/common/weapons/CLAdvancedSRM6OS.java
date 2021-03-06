/**
 * MegaMek - Copyright (C) 2005 Ben Mazur (bmazur@sev.org)
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
package megamek.common.weapons;

import megamek.common.TechConstants;

// TODO: Auto-generated Javadoc
/**
 * The Class CLAdvancedSRM6OS.
 *
 * @author Sebastian Brocks
 */
public class CLAdvancedSRM6OS extends AdvancedSRMWeapon {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -6710415894545970512L;

    /**
     * Instantiates a new CL advanced sr m6 os.
     */
    public CLAdvancedSRM6OS() {
        super();
        this.techLevel = TechConstants.T_CLAN_TW;
        this.name = "Advanced SRM 6 (OS)";
        this.setInternalName("CLAdvancedSRM6OS");
        this.rackSize = 6;
        this.shortRange = 4;
        this.mediumRange = 8;
        this.longRange = 12;
        this.extremeRange = 16;
        this.bv = 18;
        this.flags |= F_NO_FIRES | F_ONESHOT;
    }
}
