/*
 * Copyright 2018 National Bank of Belgium
 * 
 * Licensed under the EUPL, Version 1.1 or - as soon they will be approved 
 * by the European Commission - subsequent versions of the EUPL (the "Licence");
 * You may not use this work except in compliance with the Licence.
 * You may obtain a copy of the Licence at:
 * 
 * http://ec.europa.eu/idabc/eupl
 * 
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the Licence is distributed on an "AS IS" basis,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Licence for the specific language governing permissions and 
 * limitations under the Licence.
 */
package internal.workspace.file;

import ec.demetra.workspace.WorkspaceFamily;
import ec.demetra.workspace.file.FileFormat;
import ec.demetra.workspace.file.spi.FamilyHandler;
import ec.demetra.workspace.file.util.InformationSetSupport;
import ec.tss.disaggregation.documents.CalendarizationDocument;
import ec.tstoolkit.utilities.LinearId;
import org.openide.util.lookup.ServiceProvider;

/**
 *
 * @author Philippe Charles
 */
@ServiceProvider(service = FamilyHandler.class)
public final class CalendarizationDocHandler implements FamilyHandler {

    public static final LinearId FAMILY = new LinearId("Benchmarking", "Calendarization");
    public static final String REPOSITORY = "CalendarizationDoc";

    @lombok.experimental.Delegate
    private final FamilyHandler delegate = InformationSetSupport
            .of(CalendarizationDocument::new, REPOSITORY)
            .asHandler(WorkspaceFamily.of(FAMILY), FileFormat.GENERIC);
}
