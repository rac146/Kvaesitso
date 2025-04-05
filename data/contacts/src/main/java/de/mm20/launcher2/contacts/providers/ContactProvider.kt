package de.mm20.launcher2.contacts.providers

import de.mm20.launcher2.search.Contact

interface ContactProvider {
    suspend fun search(query: String, allowNetwork: Boolean): List<Contact>
}