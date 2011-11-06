/*
 * Copyright (c) 2011, Francis Galiegue <fgaliegue@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify it
 * under the terms of the Lesser GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or (at
 * your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package eel.kitchen.jsonschema.keyword.format;

import eel.kitchen.jsonschema.ValidationReport;
import eel.kitchen.jsonschema.base.AbstractValidator;
import org.codehaus.jackson.JsonNode;

/**
 * Base implementation of validations for the {@code format} keyword (draft
 * section 5.23)
 */
public abstract class AbstractFormatValidator
    extends AbstractValidator
{
    /**
     * The validation report to use
     */
    protected final ValidationReport report;

    /**
     * The node to validate
     */
    protected final JsonNode node;

    protected AbstractFormatValidator(final ValidationReport report,
        final JsonNode node)
    {
        this.report = report;
        this.node = node;
    }
}
