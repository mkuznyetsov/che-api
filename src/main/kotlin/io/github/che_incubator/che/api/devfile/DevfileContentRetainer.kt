/*
 * Copyright (c) 2022 Red Hat, Inc.
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *   Red Hat, Inc. - initial API and implementation
 */
package io.github.che_incubator.che.api.devfile

import io.github.che_incubator.devfile.kubernetes.client.models.V1alpha2DevWorkspaceSpecTemplate

interface DevfileContentRetainer {

    fun retainTemplateObject(templateObject: V1alpha2DevWorkspaceSpecTemplate)
}
