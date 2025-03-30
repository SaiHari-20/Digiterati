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
package org.apache.sling.scripting.sightly.apps.myTraining.components.book;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class book__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_clientlib = null;
Object _global_authorbookmodel = null;
Collection var_collectionvar3_list_coerced$ = null;
Object _dynamic_properties = bindings.get("properties");
_global_clientlib = renderContext.call("use", "core/wcm/components/commons/v1/templates/clientlib.html", obj());
out.write("\n    ");
{
    Object var_templatevar0 = renderContext.getObjectModel().resolveProperty(_global_clientlib, "all");
    {
        boolean var_templateoptions1_field$_async = true;
        {
            String var_templateoptions1_field$_categories = "myTraining.bookcomponent";
            {
                java.util.Map var_templateoptions1 = obj().with("async", var_templateoptions1_field$_async).with("categories", var_templateoptions1_field$_categories);
                callUnit(out, renderContext, var_templatevar0, var_templateoptions1);
            }
        }
    }
}
out.write("\n\n\n");
_global_authorbookmodel = renderContext.call("use", com.myTraining.core.models.BookModel.class.getName(), obj());
out.write("<div class=\"book-component\">\n    <div class=\"apii\">");
{
    Object var_2 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_authorbookmodel, "fetchApi"), "text");
    out.write(renderContext.getObjectModel().toString(var_2));
}
out.write("</div>\n    ");
{
    Object var_collectionvar3 = renderContext.getObjectModel().resolveProperty(_global_authorbookmodel, "books");
    {
        long var_size4 = ((var_collectionvar3_list_coerced$ == null ? (var_collectionvar3_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar3)) : var_collectionvar3_list_coerced$).size());
        {
            boolean var_notempty5 = (var_size4 > 0);
            if (var_notempty5) {
                {
                    long var_end8 = var_size4;
                    {
                        boolean var_validstartstepend9 = (((0 < var_size4) && true) && (var_end8 > 0));
                        if (var_validstartstepend9) {
                            out.write("<div>");
                            if (var_collectionvar3_list_coerced$ == null) {
                                var_collectionvar3_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar3);
                            }
                            long var_index10 = 0;
                            for (Object item : var_collectionvar3_list_coerced$) {
                                {
                                    boolean var_traversal12 = (((var_index10 >= 0) && (var_index10 <= var_end8)) && true);
                                    if (var_traversal12) {
                                        out.write("\n        <h2> Books By Author</h2>\n        <p>");
                                        {
                                            Object var_13 = renderContext.call("xss", item, "text");
                                            out.write(renderContext.getObjectModel().toString(var_13));
                                        }
                                        out.write("</p>\n        <div");
                                        {
                                            Object var_attrvalue14 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "fetchDataFromApi");
                                            {
                                                Object var_attrcontent15 = renderContext.call("xss", var_attrvalue14, "attribute");
                                                {
                                                    boolean var_shoulddisplayattr17 = (((null != var_attrcontent15) && (!"".equals(var_attrcontent15))) && ((!"".equals(var_attrvalue14)) && (!((Object)false).equals(var_attrvalue14))));
                                                    if (var_shoulddisplayattr17) {
                                                        out.write(" class");
                                                        {
                                                            boolean var_istrueattr16 = (var_attrvalue14.equals(true));
                                                            if (!var_istrueattr16) {
                                                                out.write("=\"");
                                                                out.write(renderContext.getObjectModel().toString(var_attrcontent15));
                                                                out.write("\"");
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        out.write(">\n        </div>\n        <div class=\"book-container\">\n        </div>\n        <button id=\"load-more\"");
                                        {
                                            Object var_attrvalue18 = renderContext.getObjectModel().resolveProperty(_global_authorbookmodel, "loadMoreValue");
                                            {
                                                Object var_attrcontent19 = renderContext.call("xss", var_attrvalue18, "attribute");
                                                {
                                                    boolean var_shoulddisplayattr21 = (((null != var_attrcontent19) && (!"".equals(var_attrcontent19))) && ((!"".equals(var_attrvalue18)) && (!((Object)false).equals(var_attrvalue18))));
                                                    if (var_shoulddisplayattr21) {
                                                        out.write(" data-cards-to-show");
                                                        {
                                                            boolean var_istrueattr20 = (var_attrvalue18.equals(true));
                                                            if (!var_istrueattr20) {
                                                                out.write("=\"");
                                                                out.write(renderContext.getObjectModel().toString(var_attrcontent19));
                                                                out.write("\"");
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        out.write(">");
                                        {
                                            Object var_22 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_authorbookmodel, "loadMoreCtaName"), "text");
                                            out.write(renderContext.getObjectModel().toString(var_22));
                                        }
                                        out.write("</button>\n    ");
                                    }
                                }
                                var_index10++;
                            }
                            out.write("</div>");
                        }
                    }
                }
            }
        }
    }
    var_collectionvar3_list_coerced$ = null;
}
out.write("\n</div>\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

