/*
 *  The copyright of this file belongs to FeedZai SA. The file cannot be    *
 *  reproduced in whole or in part, stored in a retrieval system,           *
 *  transmitted in any form, or by any means electronic, mechanical,        *
 *  photocopying, or otherwise, without the prior permission of the owner.  *
 *
 * (c) 2013 Feedzai SA, Rights Reserved.
 */
package com.feedzai.commons.sql.abstraction.engine;

/**
 * To be thrown if it is not possible to duplicate a connection.
 */
public class DuplicateEngineException extends Exception {
    /**
     * Creates a new instance of DuplicateEngineException.
     * @param message The message associated with the exception.
     */
    public DuplicateEngineException(String message) {
        super(message);
    }

    /**
     * Creates a new instance of DuplicateEngineException.
     * @param message The message associated with the exception.
     * @param cause The cause.
     */
    public DuplicateEngineException(String message, Throwable cause) {
        super(message, cause);
    }
}