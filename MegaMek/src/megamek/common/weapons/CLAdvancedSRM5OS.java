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
 * The Class CLAdvancedSRM5OS.
 *
 * @author Sebastian Brocks
 */
public class CLAdvancedSRM5OS extends AdvancedSRMWeapon {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 546071313282533016L;

    /**
     * Instantiates a new CL advanced sr m5 os.
     */
    public CLAdvancedSRM5OS() {
        super();
        this.techLevel = TechConstants.T_CLAN_TW;
        this.name = "Advanced SRM 5 (OS)";
        this.setInternalName("CLAdvancedSRM5OS");
        this.rackSize = 5;
        this.shortRange = 4;
        this.mediumRange = 8;
        this.longRange = 12;
        this.extremeRange = 16;
        this.bv = 15;
        this.flags |= F_NO_FIRES | F_ONESHOT;
    }
}
