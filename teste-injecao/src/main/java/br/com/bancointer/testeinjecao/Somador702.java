package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador702")
public class Somador702 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
