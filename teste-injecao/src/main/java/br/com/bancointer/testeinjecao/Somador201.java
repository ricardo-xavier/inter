package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador201")
public class Somador201 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
