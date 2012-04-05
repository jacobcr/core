/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2010, Red Hat, Inc., and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.jboss.weld.literal;

import java.lang.annotation.Annotation;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.ConversationScoped;
import javax.enterprise.context.Initialized;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.enterprise.util.AnnotationLiteral;

/**
 * Annotation literal for {@link Initialized}.
 *
 * @author Jozef Hartinger
 *
 */
@SuppressWarnings("all")
public class InitializedLiteral extends AnnotationLiteral<Initialized> implements Initialized {

    private static final long serialVersionUID = 217403232984847384L;

    public static final InitializedLiteral REQUEST = new InitializedLiteral(RequestScoped.class);
    public static final InitializedLiteral CONVERSATION = new InitializedLiteral(ConversationScoped.class);
    public static final InitializedLiteral SESSION = new InitializedLiteral(SessionScoped.class);
    public static final InitializedLiteral APPLICATION = new InitializedLiteral(ApplicationScoped.class);

    private Class<? extends Annotation> value;

    private InitializedLiteral(Class<? extends Annotation> value) {
        this.value = value;
    }

    @Override
    public Class<? extends Annotation> value() {
        return value;
    }
}