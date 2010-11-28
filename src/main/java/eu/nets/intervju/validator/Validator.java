package eu.nets.intervju.validator;

import java.io.InputStream;

/**
 * Klasse som validaterer innholdet i en {@link java.io.InputStream} mot følgende krav:
 *  - Alle linjene i strømmen inneholder en komma-separert liste med tall.
 *  - Det siste tallet på linjen skal være lik summen av de andre tallene på linjen.
 */
interface Validator
{
    boolean isValid(InputStream stream);
}
