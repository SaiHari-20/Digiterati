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
package org.apache.sling.scripting.sightly.apps.myTraining.components.page;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class customheaderlibs__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_clientlib = null;
Object _dynamic_currentpage = bindings.get("currentpage");
Object _global_customproperty = null;
_global_clientlib = renderContext.call("use", "core/wcm/components/commons/v1/templates/clientlib.html", obj());
out.write("\n    ");
{
    Object var_templatevar0 = renderContext.getObjectModel().resolveProperty(_global_clientlib, "css");
    {
        String var_templateoptions1_field$_categories = "myTraining.base";
        {
            java.util.Map var_templateoptions1 = obj().with("categories", var_templateoptions1_field$_categories);
            callUnit(out, renderContext, var_templatevar0, var_templateoptions1);
        }
    }
}
out.write("\n    ");
_global_customproperty = renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_dynamic_currentpage, "properties"), "customPageProperty");
if (renderContext.getObjectModel().toBoolean(_global_customproperty)) {
    out.write("\n        <div class=\"custom-page-property\" style=\"color: Red; font-size: 28px; width:100%; text-align:center;\">");
    {
        String var_2 = (("\n            " + renderContext.getObjectModel().toString(renderContext.call("xss", _global_customproperty, "text"))) + "\n        ");
        out.write(renderContext.getObjectModel().toString(var_2));
    }
    out.write("</div>\n        ");
    {
        Object var_includedresult3 = renderContext.call("include", "script.html", obj());
        out.write(renderContext.getObjectModel().toString(var_includedresult3));
    }
    out.write("\n    ");
}
out.write("\n\n\n");
{
    Object var_resourcecontent5 = renderContext.call("includeResource", "contexthub", obj().with("resourceType", "granite/contexthub/components/contexthub"));
    out.write(renderContext.getObjectModel().toString(var_resourcecontent5));
}
out.write("\n\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

