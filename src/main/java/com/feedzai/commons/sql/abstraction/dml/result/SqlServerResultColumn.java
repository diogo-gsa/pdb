/*
 *  The copyright of this file belongs to FeedZai SA. The file cannot be    *
 *  reproduced in whole or in part, stored in a retrieval system,           *
 *  transmitted in any form, or by any means electronic, mechanical,        *
 *  photocopying, or otherwise, without the prior permission of the owner.  *
 *
 * (c) 2013 Feedzai SA, Rights Reserved.
 */
package com.feedzai.commons.sql.abstraction.dml.result;

/**
 * The PostgreSql column result implementation.
 */
public class SqlServerResultColumn extends ResultColumn {

    /**
     * Creates a new instance of {@link PostgreSqlResultColumn}.
     * @param name The column name.
     * @param val The value.
     */
    public SqlServerResultColumn(final String name, final Object val) {
        super(name, val);
    }
}