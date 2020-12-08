package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador249")
public class Somador249 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
