package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador303")
public class Somador303 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
