/* $RCSfile$
 * $Author$    
 * $Date$    
 * $Revision$
 *
 * Copyright (C) 1997-2004  The Chemistry Development Kit (CDK) project
 * 
 * Contact: cdk-devel@lists.sourceforge.net
 * 
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public License
 * as published by the Free Software Foundation; either version 2.1
 * of the License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA. 
 * 
 */

package org.openscience.cdk;

/**
 * An interface providing predefined values for a number of 
 * parameters used throughout the CDK. Classes using these Constants should
 * implement this interface.
 *
 * @keyword bond order
 * @keyword stereochemistry
 */
public class CDKConstants {

        /** A bond of degree 1.0. */
        public final static double BONDORDER_SINGLE = 1.0;

        /** A bond of degree 1.5. */
        public final static double BONDORDER_AROMATIC = 1.5;

        /** A bond of degree 2.0. */
        public final static double BONDORDER_DOUBLE = 2.0;

        /** A bond of degree 3.0. */
        public final static double BONDORDER_TRIPLE = 3.0;

        /** A bonds which end is above the drawing plane. */
        public final static int STEREO_BOND_UP = 1;
        public final static int STEREO_BOND_UP_INV = 2;

        /** A bonds for which the stereochemistry is undefined. */
        public final static int STEREO_BOND_UNDEFINED = 4;

        /** A bonds for which there is no stereochemistry. */
        public final static int STEREO_BOND_NONE = 0;

        /** A bonds which end is below the drawing plane. */
        public final static int STEREO_BOND_DOWN = -1;
        public final static int STEREO_BOND_DOWN_INV = -2;

        public final static int STEREO_ATOM_PARITY_PLUS = 1;
        public final static int STEREO_ATOM_PARITY_MINUS = -1;
        public final static int STEREO_ATOM_PARITY_UNDEFINED = 0;

        /** 
         * Carbon NMR shift contant for use as a key in the
         * ChemObject.physicalProperties hashtable.
         * @see org.openscience.cdk.ChemObject
         */
        public final static String NMRSHIFT_CARBON = "carbon nmr shift";

        /** Hydrogen NMR shift contant for use as a key in the
          * ChemObject.physicalProperties hashtable.
          * @see org.openscience.cdk.ChemObject
          */
        public final static String NMRSHIFT_HYDROGEN = "hydrogen nmr shift";

        /** Nitrogen NMR shift contant for use as a key in the
          * ChemObject.physicalProperties hashtable.
          * @see org.openscience.cdk.ChemObject
          */
        public final static String NMRSHIFT_NITROGEN = "nitrogen nmr shift";

        /** Phosphorus NMR shift contant for use as a key in the
          * ChemObject.physicalProperties hashtable.
          * @see org.openscience.cdk.ChemObject
          */
        public final static String NMRSHIFT_PHOSPORUS = "phosphorus nmr shift";

        /** Fluorine NMR shift contant for use as a key in the
          * ChemObject.physicalProperties hashtable.
          * @see org.openscience.cdk.ChemObject
          */
        public final static String NMRSHIFT_FLUORINE = "fluorine nmr shift";

        /** Deuterium NMR shift contant for use as a key in the
          * ChemObject.physicalProperties hashtable.
          * @see org.openscience.cdk.ChemObject
          */
        public final static String NMRSHIFT_DEUTERIUM = "deuterium nmr shift";


        /****************************************
         * Some predefined flags - keep the     *
         * numbers below 50 free for other      *
         * purposes                             *
         ****************************************/

        /** Flag that is set if the chemobject is placed (somewhere).
         */
        public final static int ISPLACED = 50;
        /** Flag that is set when the chemobject is part of a ring.
         */
        public final static int ISINRING = 51;
        /** Flag that is set if a chemobject is part of an alipahtic chain.
         */
        public final static int ISALIPHATIC = 52;
        /** Flag is set if chemobject has been visited.
         */
        public final static int VISITED = 53; // Use in tree searches
        /** Flag is set if chemobject is part of an aromatic system. */
        public final static int ISAROMATIC = 54;
        /** Flag is set if a chemobject is mapped to another chemobject.
         *  It is used for example in subgraph isomorphism search.
         */
        public final static int MAPPED = 55;


    /****************************************
    * Some predefined property names for    *
    * ChemObjects                           *
    ****************************************/

    /** A String title. */
    public static final String TITLE = "Title";

    /** A String remark. */
    public static final String REMARK = "Remark";

    /** A String comment. */
    public static final String COMMENT = "Comment";

    /** A List of names. */
    public static final String NAMES = "Names";

    /** A List of annotation remarks. */
    public static final String ANNOTATIONS = "Annotations";

    /****************************************
    * Some predefined property names for    *
    * Molecules                             *
    ****************************************/

    /** The IUPAC compatible name generated with AutoNom */
    public static final String AUTONOMNAME = "AutonomName";

    /** The Beilstein Registry Number */
    public static final String BEILSTEINRN = "BeilsteinRN";

    /** The CAS Registry Number */
    public static final String CASRN = "CasRN";

}


