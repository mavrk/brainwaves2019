/* 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 */
package com.prowidesoftware.swift.model.field;

import java.io.Serializable;

import org.apache.commons.lang.StringUtils;

import com.prowidesoftware.swift.model.*;
import com.prowidesoftware.swift.utils.SwiftFormatUtils;


/**
 * Field 72<br /><br />
 *
 * validation pattern: CUSTOM<br />
 * parser pattern: S[$S]0-34<br />
 * components pattern: SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS<br />
 *
 * <h1>Components Data types</h1>
 * <ul> 
 * 		<li>component1: <code>String</code></li> 
 * 		<li>component2: <code>String</code></li> 
 * 		<li>component3: <code>String</code></li> 
 * 		<li>component4: <code>String</code></li> 
 * 		<li>component5: <code>String</code></li> 
 * 		<li>component6: <code>String</code></li> 
 * 		<li>component7: <code>String</code></li> 
 * 		<li>component8: <code>String</code></li> 
 * 		<li>component9: <code>String</code></li> 
 * 		<li>component10: <code>String</code></li> 
 * 		<li>component11: <code>String</code></li> 
 * 		<li>component12: <code>String</code></li> 
 * 		<li>component13: <code>String</code></li> 
 * 		<li>component14: <code>String</code></li> 
 * 		<li>component15: <code>String</code></li> 
 * 		<li>component16: <code>String</code></li> 
 * 		<li>component17: <code>String</code></li> 
 * 		<li>component18: <code>String</code></li> 
 * 		<li>component19: <code>String</code></li> 
 * 		<li>component20: <code>String</code></li> 
 * 		<li>component21: <code>String</code></li> 
 * 		<li>component22: <code>String</code></li> 
 * 		<li>component23: <code>String</code></li> 
 * 		<li>component24: <code>String</code></li> 
 * 		<li>component25: <code>String</code></li> 
 * 		<li>component26: <code>String</code></li> 
 * 		<li>component27: <code>String</code></li> 
 * 		<li>component28: <code>String</code></li> 
 * 		<li>component29: <code>String</code></li> 
 * 		<li>component30: <code>String</code></li> 
 * 		<li>component31: <code>String</code></li> 
 * 		<li>component32: <code>String</code></li> 
 * 		<li>component33: <code>String</code></li> 
 * 		<li>component34: <code>String</code></li> 
 * 		<li>component35: <code>String</code></li> 
 * </ul>
 *		 
 * <em>NOTE: this source code has been generated from template</em>
 *
 * @author www.prowidesoftware.com
 *
 */
@SuppressWarnings("unused") 
public class Field72 extends Field implements Serializable  {
	private static final long serialVersionUID = 1L;
	/**
	 * Constant with the field name 72
	 */
    public static final String NAME = "72";
    /**
     * same as NAME, intended to be clear when using static imports
     */
    public static final String F_72 = "72";
	public static final String PARSER_PATTERN ="S[$S]0-34";
	public static final String COMPONENTS_PATTERN = "SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS";

	/**
	* Create a Tag with this field name and the given value.
	* Shorthand for <code>new Tag(NAME, value)</code>
	* @see #NAME
	* @since 7.5
	*/
	public static Tag tag(final String value) {
		return new Tag(NAME, value);
	}

	/**
	* Create a Tag with this field name and an empty string as value
	* Shorthand for <code>new Tag(NAME, "")</code>
	* @see #NAME
	* @since 7.5
	*/
	public static Tag emptyTag() {
		return new Tag(NAME, "");
	}


	/**
	 * Default constructor
	 */
	public Field72() {
		super(35);
	}
	    					
	/**
	 * Creates the field parsing the parameter value into fields' components
	 * @param value
	 */
	public Field72(String value) {
		this();

		java.util.List<String> lines = SwiftParseUtils.getLines(value);
		SwiftParseUtils.setComponentsFromLines(this, 1, 35, 0, lines);
	}
	
	/**
	 * Serializes the fields' components into the single string value (SWIFT format)
	 */
	@Override
	public String getValue() {
		final StringBuilder result = new StringBuilder();
		result.append(StringUtils.trimToEmpty(getComponent1()));
		appendInLines(result, 2, 36);
		return result.toString();
	}


	/**
	 * Get the component1
	 * @return the component1
	 */
	public String getComponent1() {
		return getComponent(1);
	}

	/**
	 * Same as getComponent(1)
	 */
	@Deprecated
	public java.lang.String getComponent1AsString() {
		return getComponent(1);
	}

	/**
	 * Get the Code (component1).
	 * @return the Code from component1
	 */
	public String getCode() {
		return getComponent(1);
	}

	/**
	 * Set the component1.
	 * @param component1 the component1 to set
	 */
	public Field72 setComponent1(String component1) {
		setComponent(1, component1);
		return this;
	}
	
	/**
	 * Set the Code (component1).
	 * @param component1 the Code to set
	 */
	public Field72 setCode(String component1) {
		setComponent(1, component1);
		return this;
	}

	/**
	 * Get the component2
	 * @return the component2
	 */
	public String getComponent2() {
		return getComponent(2);
	}

	/**
	 * Same as getComponent(2)
	 */
	@Deprecated
	public java.lang.String getComponent2AsString() {
		return getComponent(2);
	}

	/**
	 * Get the Narrative (component2).
	 * @return the Narrative from component2
	 */
	public String getNarrative() {
		return getComponent(2);
	}

	/**
	 * Set the component2.
	 * @param component2 the component2 to set
	 */
	public Field72 setComponent2(String component2) {
		setComponent(2, component2);
		return this;
	}
	
	/**
	 * Set the Narrative (component2).
	 * @param component2 the Narrative to set
	 */
	public Field72 setNarrative(String component2) {
		setComponent(2, component2);
		return this;
	}

	/**
	 * Get the component3
	 * @return the component3
	 */
	public String getComponent3() {
		return getComponent(3);
	}

	/**
	 * Same as getComponent(3)
	 */
	@Deprecated
	public java.lang.String getComponent3AsString() {
		return getComponent(3);
	}

	/**
	 * Set the component3.
	 * @param component3 the component3 to set
	 */
	public Field72 setComponent3(String component3) {
		setComponent(3, component3);
		return this;
	}

	/**
	 * Get the component4
	 * @return the component4
	 */
	public String getComponent4() {
		return getComponent(4);
	}

	/**
	 * Same as getComponent(4)
	 */
	@Deprecated
	public java.lang.String getComponent4AsString() {
		return getComponent(4);
	}

	/**
	 * Set the component4.
	 * @param component4 the component4 to set
	 */
	public Field72 setComponent4(String component4) {
		setComponent(4, component4);
		return this;
	}

	/**
	 * Get the component5
	 * @return the component5
	 */
	public String getComponent5() {
		return getComponent(5);
	}

	/**
	 * Same as getComponent(5)
	 */
	@Deprecated
	public java.lang.String getComponent5AsString() {
		return getComponent(5);
	}

	/**
	 * Set the component5.
	 * @param component5 the component5 to set
	 */
	public Field72 setComponent5(String component5) {
		setComponent(5, component5);
		return this;
	}

	/**
	 * Get the component6
	 * @return the component6
	 */
	public String getComponent6() {
		return getComponent(6);
	}

	/**
	 * Same as getComponent(6)
	 */
	@Deprecated
	public java.lang.String getComponent6AsString() {
		return getComponent(6);
	}

	/**
	 * Set the component6.
	 * @param component6 the component6 to set
	 */
	public Field72 setComponent6(String component6) {
		setComponent(6, component6);
		return this;
	}

	/**
	 * Get the component7
	 * @return the component7
	 */
	public String getComponent7() {
		return getComponent(7);
	}

	/**
	 * Same as getComponent(7)
	 */
	@Deprecated
	public java.lang.String getComponent7AsString() {
		return getComponent(7);
	}

	/**
	 * Set the component7.
	 * @param component7 the component7 to set
	 */
	public Field72 setComponent7(String component7) {
		setComponent(7, component7);
		return this;
	}

	/**
	 * Get the component8
	 * @return the component8
	 */
	public String getComponent8() {
		return getComponent(8);
	}

	/**
	 * Same as getComponent(8)
	 */
	@Deprecated
	public java.lang.String getComponent8AsString() {
		return getComponent(8);
	}

	/**
	 * Set the component8.
	 * @param component8 the component8 to set
	 */
	public Field72 setComponent8(String component8) {
		setComponent(8, component8);
		return this;
	}

	/**
	 * Get the component9
	 * @return the component9
	 */
	public String getComponent9() {
		return getComponent(9);
	}

	/**
	 * Same as getComponent(9)
	 */
	@Deprecated
	public java.lang.String getComponent9AsString() {
		return getComponent(9);
	}

	/**
	 * Set the component9.
	 * @param component9 the component9 to set
	 */
	public Field72 setComponent9(String component9) {
		setComponent(9, component9);
		return this;
	}

	/**
	 * Get the component10
	 * @return the component10
	 */
	public String getComponent10() {
		return getComponent(10);
	}

	/**
	 * Same as getComponent(10)
	 */
	@Deprecated
	public java.lang.String getComponent10AsString() {
		return getComponent(10);
	}

	/**
	 * Set the component10.
	 * @param component10 the component10 to set
	 */
	public Field72 setComponent10(String component10) {
		setComponent(10, component10);
		return this;
	}

	/**
	 * Get the component11
	 * @return the component11
	 */
	public String getComponent11() {
		return getComponent(11);
	}

	/**
	 * Same as getComponent(11)
	 */
	@Deprecated
	public java.lang.String getComponent11AsString() {
		return getComponent(11);
	}

	/**
	 * Set the component11.
	 * @param component11 the component11 to set
	 */
	public Field72 setComponent11(String component11) {
		setComponent(11, component11);
		return this;
	}

	/**
	 * Get the component12
	 * @return the component12
	 */
	public String getComponent12() {
		return getComponent(12);
	}

	/**
	 * Same as getComponent(12)
	 */
	@Deprecated
	public java.lang.String getComponent12AsString() {
		return getComponent(12);
	}

	/**
	 * Set the component12.
	 * @param component12 the component12 to set
	 */
	public Field72 setComponent12(String component12) {
		setComponent(12, component12);
		return this;
	}

	/**
	 * Get the component13
	 * @return the component13
	 */
	public String getComponent13() {
		return getComponent(13);
	}

	/**
	 * Same as getComponent(13)
	 */
	@Deprecated
	public java.lang.String getComponent13AsString() {
		return getComponent(13);
	}

	/**
	 * Set the component13.
	 * @param component13 the component13 to set
	 */
	public Field72 setComponent13(String component13) {
		setComponent(13, component13);
		return this;
	}

	/**
	 * Get the component14
	 * @return the component14
	 */
	public String getComponent14() {
		return getComponent(14);
	}

	/**
	 * Same as getComponent(14)
	 */
	@Deprecated
	public java.lang.String getComponent14AsString() {
		return getComponent(14);
	}

	/**
	 * Set the component14.
	 * @param component14 the component14 to set
	 */
	public Field72 setComponent14(String component14) {
		setComponent(14, component14);
		return this;
	}

	/**
	 * Get the component15
	 * @return the component15
	 */
	public String getComponent15() {
		return getComponent(15);
	}

	/**
	 * Same as getComponent(15)
	 */
	@Deprecated
	public java.lang.String getComponent15AsString() {
		return getComponent(15);
	}

	/**
	 * Set the component15.
	 * @param component15 the component15 to set
	 */
	public Field72 setComponent15(String component15) {
		setComponent(15, component15);
		return this;
	}

	/**
	 * Get the component16
	 * @return the component16
	 */
	public String getComponent16() {
		return getComponent(16);
	}

	/**
	 * Same as getComponent(16)
	 */
	@Deprecated
	public java.lang.String getComponent16AsString() {
		return getComponent(16);
	}

	/**
	 * Set the component16.
	 * @param component16 the component16 to set
	 */
	public Field72 setComponent16(String component16) {
		setComponent(16, component16);
		return this;
	}

	/**
	 * Get the component17
	 * @return the component17
	 */
	public String getComponent17() {
		return getComponent(17);
	}

	/**
	 * Same as getComponent(17)
	 */
	@Deprecated
	public java.lang.String getComponent17AsString() {
		return getComponent(17);
	}

	/**
	 * Set the component17.
	 * @param component17 the component17 to set
	 */
	public Field72 setComponent17(String component17) {
		setComponent(17, component17);
		return this;
	}

	/**
	 * Get the component18
	 * @return the component18
	 */
	public String getComponent18() {
		return getComponent(18);
	}

	/**
	 * Same as getComponent(18)
	 */
	@Deprecated
	public java.lang.String getComponent18AsString() {
		return getComponent(18);
	}

	/**
	 * Set the component18.
	 * @param component18 the component18 to set
	 */
	public Field72 setComponent18(String component18) {
		setComponent(18, component18);
		return this;
	}

	/**
	 * Get the component19
	 * @return the component19
	 */
	public String getComponent19() {
		return getComponent(19);
	}

	/**
	 * Same as getComponent(19)
	 */
	@Deprecated
	public java.lang.String getComponent19AsString() {
		return getComponent(19);
	}

	/**
	 * Set the component19.
	 * @param component19 the component19 to set
	 */
	public Field72 setComponent19(String component19) {
		setComponent(19, component19);
		return this;
	}

	/**
	 * Get the component20
	 * @return the component20
	 */
	public String getComponent20() {
		return getComponent(20);
	}

	/**
	 * Same as getComponent(20)
	 */
	@Deprecated
	public java.lang.String getComponent20AsString() {
		return getComponent(20);
	}

	/**
	 * Set the component20.
	 * @param component20 the component20 to set
	 */
	public Field72 setComponent20(String component20) {
		setComponent(20, component20);
		return this;
	}

	/**
	 * Get the component21
	 * @return the component21
	 */
	public String getComponent21() {
		return getComponent(21);
	}

	/**
	 * Same as getComponent(21)
	 */
	@Deprecated
	public java.lang.String getComponent21AsString() {
		return getComponent(21);
	}

	/**
	 * Set the component21.
	 * @param component21 the component21 to set
	 */
	public Field72 setComponent21(String component21) {
		setComponent(21, component21);
		return this;
	}

	/**
	 * Get the component22
	 * @return the component22
	 */
	public String getComponent22() {
		return getComponent(22);
	}

	/**
	 * Same as getComponent(22)
	 */
	@Deprecated
	public java.lang.String getComponent22AsString() {
		return getComponent(22);
	}

	/**
	 * Set the component22.
	 * @param component22 the component22 to set
	 */
	public Field72 setComponent22(String component22) {
		setComponent(22, component22);
		return this;
	}

	/**
	 * Get the component23
	 * @return the component23
	 */
	public String getComponent23() {
		return getComponent(23);
	}

	/**
	 * Same as getComponent(23)
	 */
	@Deprecated
	public java.lang.String getComponent23AsString() {
		return getComponent(23);
	}

	/**
	 * Set the component23.
	 * @param component23 the component23 to set
	 */
	public Field72 setComponent23(String component23) {
		setComponent(23, component23);
		return this;
	}

	/**
	 * Get the component24
	 * @return the component24
	 */
	public String getComponent24() {
		return getComponent(24);
	}

	/**
	 * Same as getComponent(24)
	 */
	@Deprecated
	public java.lang.String getComponent24AsString() {
		return getComponent(24);
	}

	/**
	 * Set the component24.
	 * @param component24 the component24 to set
	 */
	public Field72 setComponent24(String component24) {
		setComponent(24, component24);
		return this;
	}

	/**
	 * Get the component25
	 * @return the component25
	 */
	public String getComponent25() {
		return getComponent(25);
	}

	/**
	 * Same as getComponent(25)
	 */
	@Deprecated
	public java.lang.String getComponent25AsString() {
		return getComponent(25);
	}

	/**
	 * Set the component25.
	 * @param component25 the component25 to set
	 */
	public Field72 setComponent25(String component25) {
		setComponent(25, component25);
		return this;
	}

	/**
	 * Get the component26
	 * @return the component26
	 */
	public String getComponent26() {
		return getComponent(26);
	}

	/**
	 * Same as getComponent(26)
	 */
	@Deprecated
	public java.lang.String getComponent26AsString() {
		return getComponent(26);
	}

	/**
	 * Set the component26.
	 * @param component26 the component26 to set
	 */
	public Field72 setComponent26(String component26) {
		setComponent(26, component26);
		return this;
	}

	/**
	 * Get the component27
	 * @return the component27
	 */
	public String getComponent27() {
		return getComponent(27);
	}

	/**
	 * Same as getComponent(27)
	 */
	@Deprecated
	public java.lang.String getComponent27AsString() {
		return getComponent(27);
	}

	/**
	 * Set the component27.
	 * @param component27 the component27 to set
	 */
	public Field72 setComponent27(String component27) {
		setComponent(27, component27);
		return this;
	}

	/**
	 * Get the component28
	 * @return the component28
	 */
	public String getComponent28() {
		return getComponent(28);
	}

	/**
	 * Same as getComponent(28)
	 */
	@Deprecated
	public java.lang.String getComponent28AsString() {
		return getComponent(28);
	}

	/**
	 * Set the component28.
	 * @param component28 the component28 to set
	 */
	public Field72 setComponent28(String component28) {
		setComponent(28, component28);
		return this;
	}

	/**
	 * Get the component29
	 * @return the component29
	 */
	public String getComponent29() {
		return getComponent(29);
	}

	/**
	 * Same as getComponent(29)
	 */
	@Deprecated
	public java.lang.String getComponent29AsString() {
		return getComponent(29);
	}

	/**
	 * Set the component29.
	 * @param component29 the component29 to set
	 */
	public Field72 setComponent29(String component29) {
		setComponent(29, component29);
		return this;
	}

	/**
	 * Get the component30
	 * @return the component30
	 */
	public String getComponent30() {
		return getComponent(30);
	}

	/**
	 * Same as getComponent(30)
	 */
	@Deprecated
	public java.lang.String getComponent30AsString() {
		return getComponent(30);
	}

	/**
	 * Set the component30.
	 * @param component30 the component30 to set
	 */
	public Field72 setComponent30(String component30) {
		setComponent(30, component30);
		return this;
	}

	/**
	 * Get the component31
	 * @return the component31
	 */
	public String getComponent31() {
		return getComponent(31);
	}

	/**
	 * Same as getComponent(31)
	 */
	@Deprecated
	public java.lang.String getComponent31AsString() {
		return getComponent(31);
	}

	/**
	 * Set the component31.
	 * @param component31 the component31 to set
	 */
	public Field72 setComponent31(String component31) {
		setComponent(31, component31);
		return this;
	}

	/**
	 * Get the component32
	 * @return the component32
	 */
	public String getComponent32() {
		return getComponent(32);
	}

	/**
	 * Same as getComponent(32)
	 */
	@Deprecated
	public java.lang.String getComponent32AsString() {
		return getComponent(32);
	}

	/**
	 * Set the component32.
	 * @param component32 the component32 to set
	 */
	public Field72 setComponent32(String component32) {
		setComponent(32, component32);
		return this;
	}

	/**
	 * Get the component33
	 * @return the component33
	 */
	public String getComponent33() {
		return getComponent(33);
	}

	/**
	 * Same as getComponent(33)
	 */
	@Deprecated
	public java.lang.String getComponent33AsString() {
		return getComponent(33);
	}

	/**
	 * Set the component33.
	 * @param component33 the component33 to set
	 */
	public Field72 setComponent33(String component33) {
		setComponent(33, component33);
		return this;
	}

	/**
	 * Get the component34
	 * @return the component34
	 */
	public String getComponent34() {
		return getComponent(34);
	}

	/**
	 * Same as getComponent(34)
	 */
	@Deprecated
	public java.lang.String getComponent34AsString() {
		return getComponent(34);
	}

	/**
	 * Set the component34.
	 * @param component34 the component34 to set
	 */
	public Field72 setComponent34(String component34) {
		setComponent(34, component34);
		return this;
	}

	/**
	 * Get the component35
	 * @return the component35
	 */
	public String getComponent35() {
		return getComponent(35);
	}

	/**
	 * Same as getComponent(35)
	 */
	@Deprecated
	public java.lang.String getComponent35AsString() {
		return getComponent(35);
	}

	/**
	 * Set the component35.
	 * @param component35 the component35 to set
	 */
	public Field72 setComponent35(String component35) {
		setComponent(35, component35);
		return this;
	}

   /**
    * Given a component number it returns true if the component is optional,
    * regardless of the field being mandatory in a particular message.<br />
    * Being the field's value conformed by a composition of one or several 
    * internal component values, the field may be present in a message with
    * a proper value but with some of its internal components not set.
    *
    * @param component component number, first component of a field is referenced as 1
    * @return true if the component is optional for this field, false otherwise
    */
   @Override
   public boolean isOptional(int component) {   
       if (component == 2) {
           return true;
       }
       if (component == 3) {
           return true;
       }
       if (component == 4) {
           return true;
       }
       if (component == 5) {
           return true;
       }
       if (component == 6) {
           return true;
       }
       if (component == 7) {
           return true;
       }
       if (component == 8) {
           return true;
       }
       if (component == 9) {
           return true;
       }
       if (component == 10) {
           return true;
       }
       if (component == 11) {
           return true;
       }
       if (component == 12) {
           return true;
       }
       if (component == 13) {
           return true;
       }
       if (component == 14) {
           return true;
       }
       if (component == 15) {
           return true;
       }
       if (component == 16) {
           return true;
       }
       if (component == 17) {
           return true;
       }
       if (component == 18) {
           return true;
       }
       if (component == 19) {
           return true;
       }
       if (component == 20) {
           return true;
       }
       if (component == 21) {
           return true;
       }
       if (component == 22) {
           return true;
       }
       if (component == 23) {
           return true;
       }
       if (component == 24) {
           return true;
       }
       if (component == 25) {
           return true;
       }
       if (component == 26) {
           return true;
       }
       if (component == 27) {
           return true;
       }
       if (component == 28) {
           return true;
       }
       if (component == 29) {
           return true;
       }
       if (component == 30) {
           return true;
       }
       if (component == 31) {
           return true;
       }
       if (component == 32) {
           return true;
       }
       if (component == 33) {
           return true;
       }
       if (component == 34) {
           return true;
       }
       if (component == 35) {
           return true;
       }
       return false;
   }

   /**
    * Returns true if the field is a GENERIC FIELD as specified by the standard.
    *
    * @return true if the field is generic, false otherwise
    */
   @Override
   public boolean isGeneric() {   
       return false;
   }
   
   public String componentsPattern() {
           return COMPONENTS_PATTERN;
   }

   public String parserPattern() {
           return PARSER_PATTERN;
   }

	/**
	* @deprecated use constant Field72	*/
	@Override
	public String getName() {
		return NAME;
	}
	
	/**
	* Get the first occurrence form the tag list or null if not found.
	* @return null if not found o block is null or empty
	* @param block may be null or empty 
	*/
	public static Field72 get(final SwiftTagListBlock block) {
		if (block == null || block.isEmpty()) {
			return null;
		}
		return (Field72) block.getFieldByName(NAME);
	}
	
	/**
	 * Get the first instance of Field72 in the given message.
	 * @param msg may be empty or null
	 * @return null if not found or msg is empty or null
	 * @see #get(SwiftTagListBlock)
	 */
	public static Field72 get(final SwiftMessage msg) {
		if (msg == null || msg.getBlock4()==null || msg.getBlock4().isEmpty())
			return null;
		return get(msg.getBlock4());
	}

	/**
	 * Get a list of all occurrences of the field Field72 in the given message
	 * an empty list is returned if none found.
	 * @param msg may be empty or null in which case an empty list is returned
	 * @see #getAll(SwiftTagListBlock)
	 */ 
	public static java.util.List<Field72> getAll(final SwiftMessage msg) {
		if (msg == null || msg.getBlock4()==null || msg.getBlock4().isEmpty())
			return null;
		return getAll(msg.getBlock4());
	}

	/**
	 * Get a list of all occurrences of the field Field72 from the given block
	 * an empty list is returned if none found.
	 *
	 * @param block may be empty or null in which case an empty list is returned 
	 */ 
	public static java.util.List<Field72> getAll(final SwiftTagListBlock block) {
		if (block == null || block.isEmpty()) {
			return null;
		}
		final Field[] arr = block.getFieldsByName(NAME);
		if (arr != null && arr.length>0) {
			final java.util.ArrayList<Field72> result = new java.util.ArrayList<Field72>(arr.length);
			for (final Field f : arr) {
				result.add((Field72) f);
			}
			return result;
		}
		return java.util.Collections.emptyList();
	}
	
	


}
