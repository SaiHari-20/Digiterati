/*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 ******************************************************************************/
package org.apache.sling.scripting.sightly.apps.myTraining.components.author;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class author__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _dynamic_properties = bindings.get("properties");
Object _global_website = null;
Object _global_authormodel = null;
Collection var_collectionvar8_list_coerced$ = null;
out.write("<div class=\"author-component\">\n    <h2>");
{
    String var_0 = ("Author Name: " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "authorName"), "text")));
    out.write(renderContext.getObjectModel().toString(var_0));
}
out.write("</h2>\n    <p>");
{
    String var_1 = ("Author BIO: " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "authorBio"), "text")));
    out.write(renderContext.getObjectModel().toString(var_1));
}
out.write("</p>\n    <p><strong>Author Date of Birth:</strong>");
{
    String var_2 = ((" " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.call("format", "dd MMMM, YYYY", obj().with("format", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "dob")).with("type", "datetime")), "text"))) + "\n\n");
    out.write(renderContext.getObjectModel().toString(var_2));
}
out.write("</div>\n\n\n");
_global_website = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "authorWebsite");
if (renderContext.getObjectModel().toBoolean(_global_website)) {
    out.write("\n    <p>Website: <a");
    {
        Object var_attrvalue3 = _global_website;
        {
            Object var_attrcontent4 = renderContext.call("xss", var_attrvalue3, "uri");
            {
                boolean var_shoulddisplayattr6 = (((null != var_attrcontent4) && (!"".equals(var_attrcontent4))) && ((!"".equals(var_attrvalue3)) && (!((Object)false).equals(var_attrvalue3))));
                if (var_shoulddisplayattr6) {
                    out.write(" href");
                    {
                        boolean var_istrueattr5 = (var_attrvalue3.equals(true));
                        if (!var_istrueattr5) {
                            out.write("=\"");
                            out.write(renderContext.getObjectModel().toString(var_attrcontent4));
                            out.write("\"");
                        }
                    }
                }
            }
        }
    }
    out.write(" target=\"_blank\">");
    {
        Object var_7 = renderContext.call("xss", _global_website, "text");
        out.write(renderContext.getObjectModel().toString(var_7));
    }
    out.write("</a></p>\n");
}
out.write("\n\n\n");
_global_authormodel = renderContext.call("use", com.myTraining.core.models.AuthorModel.class.getName(), obj());
out.write("<div>\n    <h3>Quotes</h3>\n    <ul>\n        ");
{
    Object var_collectionvar8 = renderContext.getObjectModel().resolveProperty(_global_authormodel, "quotes");
    {
        long var_size9 = ((var_collectionvar8_list_coerced$ == null ? (var_collectionvar8_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar8)) : var_collectionvar8_list_coerced$).size());
        {
            boolean var_notempty10 = (var_size9 > 0);
            if (var_notempty10) {
                {
                    long var_end13 = var_size9;
                    {
                        boolean var_validstartstepend14 = (((0 < var_size9) && true) && (var_end13 > 0));
                        if (var_validstartstepend14) {
                            if (var_collectionvar8_list_coerced$ == null) {
                                var_collectionvar8_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar8);
                            }
                            long var_index15 = 0;
                            for (Object quote : var_collectionvar8_list_coerced$) {
                                {
                                    boolean var_traversal17 = (((var_index15 >= 0) && (var_index15 <= var_end13)) && true);
                                    if (var_traversal17) {
                                        out.write("\n            <li>");
                                        {
                                            Object var_18 = renderContext.call("xss", quote, "text");
                                            out.write(renderContext.getObjectModel().toString(var_18));
                                        }
                                        out.write("</li>\n        ");
                                    }
                                }
                                var_index15++;
                            }
                        }
                    }
                }
            }
        }
    }
    var_collectionvar8_list_coerced$ = null;
}
out.write("\n    </ul>\n</div>");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

