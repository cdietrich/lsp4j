/**
 * Copyright (c) 2017, 2019 Kichwa Coders Ltd. and others.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0,
 * or the Eclipse Distribution License v. 1.0 which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 * 
 * SPDX-License-Identifier: EPL-2.0 OR BSD-3-Clause
 */
package org.eclipse.lsp4j.debug;

/**
 * Visibility of variable. Before introducing additional values, try to use the listed values.
 * <p>
 * Possible values include - but not limited to those defined in {@link VariablePresentationHintVisibility}
 */
@SuppressWarnings("all")
public interface VariablePresentationHintVisibility {
  public static final String PUBLIC = "public";
  
  public static final String PRIVATE = "private";
  
  public static final String PROTECTED = "protected";
  
  public static final String INTERNAL = "internal";
  
  public static final String FINAL = "final";
}
